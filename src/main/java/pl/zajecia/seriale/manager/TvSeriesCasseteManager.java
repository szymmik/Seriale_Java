package pl.zajecia.seriale.manager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.zajecia.seriale.dao.TvSeriesCassete;
import pl.zajecia.seriale.dao.TvSeriesCasseteRepo;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class TvSeriesCasseteManager {
    private TvSeriesCasseteRepo tvSeriesCasseteRepo;

    @Autowired
    public TvSeriesCasseteManager(TvSeriesCasseteRepo tvSeriesCasseteRepo){
        this.tvSeriesCasseteRepo = tvSeriesCasseteRepo;
    }
    public Optional<TvSeriesCassete> findAllById(Long id){
        return tvSeriesCasseteRepo.findById(id);
    }
    public Iterable<TvSeriesCassete> findAll(){
        return tvSeriesCasseteRepo.findAll();
    }
    public TvSeriesCassete save(TvSeriesCassete tvSeriesCassete){
        return tvSeriesCasseteRepo.save(tvSeriesCassete);
    }
    public void delete(Long id){
        tvSeriesCasseteRepo.deleteById(id);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void fillDb(){
        save(new TvSeriesCassete(1L,"Breaking Bad", LocalDate.of(2006,1,1)));
        save(new TvSeriesCassete(2L,"Stranger Things", LocalDate.of(2023,4,4)));
    }
}
