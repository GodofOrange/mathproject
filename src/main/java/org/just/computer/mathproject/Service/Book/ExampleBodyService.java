package org.just.computer.mathproject.Service.Book;

import org.just.computer.mathproject.DAO.Book.ExampleBodyResp;
import org.just.computer.mathproject.Entity.Book.Book;
import org.just.computer.mathproject.Entity.Book.ExampleBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleBodyService {
    @Autowired
    ExampleBodyResp exampleBodyResp;

    public List<ExampleBody> getAllExampleBody() {
        return exampleBodyResp.findAll();
    }

    public void addExampleBody(Integer exampleid,String body,String answer) {
        ExampleBody exampleBody=new ExampleBody();
        exampleBody.setExampleid(exampleid);
        exampleBody.setBody(body);
        exampleBody.setAnswer(answer);
        exampleBodyResp.save(exampleBody);
    }
    public ExampleBody getExampleBodyByExampleId(Integer id){
        return exampleBodyResp.findByExampleidEquals(id);
    }
    public void deleteExampleBodyById(Integer id){
        exampleBodyResp.deleteById(id);
    }
}
