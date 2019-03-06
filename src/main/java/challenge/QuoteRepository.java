package challenge;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Integer> {
	

	@Query(value="SELECT * FROM SCRIPTS ORDER BY RAND() LIMIT 1", nativeQuery=true)
	public Quote findQuote();
    
   public List<Quote> findByActor(String actor);

}
