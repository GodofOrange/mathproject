package org.just.computer.mathproject.DAO;

import org.just.computer.mathproject.Entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnouncementResp extends JpaRepository<Announcement,Integer> {
}
