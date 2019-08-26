package org.just.computer.mathproject.Service;

import org.just.computer.mathproject.DAO.OccupationResp;
import org.just.computer.mathproject.Entity.Occupation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OccupationService {
    @Autowired
    OccupationResp occupationResp;

    /**
     * 获得所有Occupation对象
     * @return
     */
    public List<Occupation> getAllOccupation(){
        return occupationResp.findAll();
    }

    public void addOccupation(String job){
        Occupation occupation = new Occupation();
        occupation.setJob(job);
        occupationResp.save(occupation);
    }
}
