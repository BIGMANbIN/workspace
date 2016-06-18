import com.it.entity.Movie;
import com.it.service.MovieService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class MovieServiceTest {

    private Logger logger = LoggerFactory.getLogger(MovieServiceTest.class);
    private MovieService movieService = new MovieService();


    @Test
    public void findAllMovie(){
        List<Movie> movieList = movieService.findAllMovie();
        assertNotNull(movieList);        
    }

    @Test
    public void findByPage(){
        List<Movie> movieList = movieService.findByPageNo(1);
        for (Movie movie : movieList) {
            logger.debug("{}",movie);
        }
        assertEquals(10,movieList.size());

    }

}
