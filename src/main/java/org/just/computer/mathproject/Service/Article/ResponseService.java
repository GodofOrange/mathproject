package org.just.computer.mathproject.Service.Article;

import org.just.computer.mathproject.DAO.Article.ResponseResp;
import org.just.computer.mathproject.Entity.Article.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ResponseService {
    @Autowired
    ResponseResp responseResp;

    public List<Response> getAllResponse() {
        return responseResp.findAll();
    }

    public void addResponse(Integer questionid,String username,Integer enabled) {
        Response response=new Response();
        response.setQuestionid(questionid);
        response.setUsername(username);
        response.setEnabled(enabled);
        response.setTime(new Date());
        responseResp.save(response);
    }

    public void deleteResponseById(Integer id){
        responseResp.deleteById(id);
    }
}
