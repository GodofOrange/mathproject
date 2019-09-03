package org.just.computer.mathproject.Service.Book;

import org.just.computer.mathproject.DAO.Book.ExampleLinksResp;
import org.just.computer.mathproject.Entity.Book.ExampleLinks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleLinksService {
    @Autowired
    ExampleLinksResp exampleLinksResp;
    public List<ExampleLinks> getExampleLinksByexampleid(Integer id){
        return exampleLinksResp.findAllByExampleidEquals(id);
    }
    public void addByExampleid(List<Integer> list,Integer id){
        if(list!=null)
        for(Integer problemsetid:list){
            ExampleLinks exampleLinks = new ExampleLinks();
            exampleLinks.setExampleid(id);
            exampleLinks.setProblemsetid(problemsetid);
            exampleLinksResp.save(exampleLinks);
        }
    }
}
