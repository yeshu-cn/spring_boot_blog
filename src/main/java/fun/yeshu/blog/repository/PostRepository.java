package fun.yeshu.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fun.yeshu.blog.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long>{
    
}
