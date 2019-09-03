package org.just.computer.mathproject.Service.Book;

import org.just.computer.mathproject.Bean.ExampleLinksBean;
import org.just.computer.mathproject.DAO.Book.ExampleLinksResp;
import org.just.computer.mathproject.DAO.Problem.ProblemsetResp;
import org.just.computer.mathproject.Entity.Book.ExampleLinks;
import org.just.computer.mathproject.Entity.Problem.Problemset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExampleLinksService {
    @Autowired
    ExampleLinksResp exampleLinksResp;
    @Autowired
    ProblemsetResp problemsetResp;
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
    public List<ExampleLinksBean> getExampleNamesByExampleid(Integer id){
        List<ExampleLinksBean> l = new ArrayList<>();
        List<ExampleLinks> exampleLinks= exampleLinksResp.findAllByExampleidEquals(id);
        for(ExampleLinks e:exampleLinks){
            Problemset problemset = problemsetResp.findByIdEquals(e.getProblemsetid());
            ExampleLinksBean exampleLinksBean = new ExampleLinksBean();
            exampleLinksBean.setTitle(problemset.getTitle());
            exampleLinksBean.setProblemsetId(e.getProblemsetid());
            exampleLinksBean.setLevel(problemset.getLevel());
            l.add(exampleLinksBean);
        }
        return l;
    }
}
