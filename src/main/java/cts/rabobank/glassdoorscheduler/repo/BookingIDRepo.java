package cts.rabobank.glassdoorscheduler.repo;

import cts.rabobank.glassdoorscheduler.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingIDRepo extends JpaRepository<Booking, Long> {

}
