package pl.zajecia.seriale.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TvSeriesCasseteRepo extends CrudRepository<TvSeriesCassete, Long> {
}
