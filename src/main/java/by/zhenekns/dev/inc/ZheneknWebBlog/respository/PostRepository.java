package by.zhenekns.dev.inc.ZheneknWebBlog.respository;

import by.zhenekns.dev.inc.ZheneknWebBlog.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
