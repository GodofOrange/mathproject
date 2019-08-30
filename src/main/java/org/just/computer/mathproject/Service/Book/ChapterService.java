package org.just.computer.mathproject.Service.Book;

import org.just.computer.mathproject.DAO.Book.ChapterResp;
import org.just.computer.mathproject.Entity.Book.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterService {
    @Autowired
    ChapterResp chapterResp;

    public List<Chapter> getAllChapter() {
        return chapterResp.findAll();
    }

    public void addChapter(Integer bookid,String title) {
        Chapter chapter=new Chapter();
        chapter.setBookid(bookid);
        chapter.setTitle(title);
        chapterResp.save(chapter);
    }
    public List<Chapter> findAllByBookid(Integer id){
        return chapterResp.findAllByBookidEquals(id);
    }

    public void deleteChapterById(Integer id){
        chapterResp.deleteById(id);
    }
}
