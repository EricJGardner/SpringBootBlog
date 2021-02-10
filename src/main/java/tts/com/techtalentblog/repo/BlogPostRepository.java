package tts.com.techtalentblog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tts.com.techtalentblog.model.BlogPost;

//This will import the Spring CrudRepository and the methods
// needed to modify data in our database. Long
//is a type, a wrapper class that represents your id
//anything in the diamond is known as a generic or type parameters
@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {
}
