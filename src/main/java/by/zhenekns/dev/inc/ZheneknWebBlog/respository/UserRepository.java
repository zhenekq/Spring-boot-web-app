package by.zhenekns.dev.inc.ZheneknWebBlog.respository;

import by.zhenekns.dev.inc.ZheneknWebBlog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByEmail(String username);

}
