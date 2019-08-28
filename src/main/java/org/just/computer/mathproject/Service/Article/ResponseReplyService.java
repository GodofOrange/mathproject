package org.just.computer.mathproject.Service.Article;

import org.just.computer.mathproject.DAO.Article.ResponseReplyResp;
import org.just.computer.mathproject.Entity.Article.ResponseReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ResponseReplyService {
    @Autowired
    ResponseReplyResp responseReplyResp;

    public List<ResponseReply> getAllResponseReply() {
        return responseReplyResp.findAll();
    }

    public void addResponseReply(Integer responseid,String content,Integer userid) {
        ResponseReply responseReply=new ResponseReply();
        responseReply.setResponseid(responseid);
        responseReply.setContent(content);
        responseReply.setTime(new Date());
        responseReply.setUserid(userid);
        responseReplyResp.save(responseReply);
    }

    public void deleteResponseReplyById(Integer id){
        responseReplyResp.deleteById(id);
    }
}
