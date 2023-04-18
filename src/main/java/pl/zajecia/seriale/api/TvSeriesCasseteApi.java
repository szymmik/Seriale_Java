package pl.zajecia.seriale.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.zajecia.seriale.dao.TvSeriesCassete;
import pl.zajecia.seriale.manager.TvSeriesCasseteManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController

@RequestMapping("/api/tvseries")
public class TvSeriesCasseteApi {

    private TvSeriesCasseteManager tvseries;

    @Autowired
    public TvSeriesCasseteApi(TvSeriesCasseteManager tvseries){
        this.tvseries = tvseries;
    }
    @GetMapping("/all")
        public Iterable<TvSeriesCassete> getAll(){
        return tvseries.findAll();
    }
    @GetMapping
    public Optional<TvSeriesCassete> getById(@RequestParam long index){
        return tvseries.findAllById(index);
    }
    @PostMapping
    public TvSeriesCassete addTvSeries(@RequestBody TvSeriesCassete tvSeriesCassete){
        return tvseries.save(tvSeriesCassete);
    }
    @PutMapping
    public TvSeriesCassete updateTvSeries(@RequestBody TvSeriesCassete tvSeriesCassete){
        return tvseries.save(tvSeriesCassete);
    }
    @DeleteMapping
    public void deleteTvSeries(@RequestParam long index){
        tvseries.delete(index);
    }


}
