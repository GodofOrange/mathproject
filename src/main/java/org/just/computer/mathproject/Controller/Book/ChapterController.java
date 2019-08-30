package org.just.computer.mathproject.Controller.Book;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.just.computer.mathproject.Entity.Book.Chapter;
import org.just.computer.mathproject.Service.Book.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags ="章节")
@RequestMapping("/Chapter/")
public class ChapterController {
    @Autowired
    ChapterService chapterService;

    @ApiOperation(value ="获得所有章节")
    @GetMapping("/getAllChapter")
    public List<Chapter> getAllChapter(){
        return chapterService.getAllChapter();
    }

    @ApiOperation(value = "添加章节")
    @GetMapping("/addChapter")
    public Boolean getAllChapter(@RequestParam Integer bookid,@RequestParam String title){
        try {
            chapterService.addChapter(bookid,title);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @ApiOperation(value ="按书名id查找章节")
    @GetMapping("/findAllByBookid")
    public List<Chapter> findAllByBookid(Integer id){
        return chapterService.findAllByBookid(id);
    }

    @ApiOperation(value = "删除章节")
    @GetMapping("/deleteChapter")
    public Boolean deleteChapterById(Integer id){
        try{
            chapterService.deleteChapterById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
