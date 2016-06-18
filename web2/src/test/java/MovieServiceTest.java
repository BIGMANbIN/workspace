import com.it.dao.MovieDao;
import com.it.entity.Movie;
import com.it.service.MovieService;
import com.it.util.Page;
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
        Page<Movie> page = movieService.findByPageNo(1);
        for (Movie movie :page.getItems()) {
            logger.debug("{}",movie);
        }
        assertEquals(10,page.getItems().size());

    }

    @Test
    public void findByPageTest(){
        MovieDao movieDao = new MovieDao();


        assertEquals(10,movieDao.findByPage(0,10).size());
    }

}
