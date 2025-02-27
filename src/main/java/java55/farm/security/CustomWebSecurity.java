package java55.farm.security;


import java55.farm.auth_farm.dao.FarmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service("webSecurity")
@RequiredArgsConstructor
public class CustomWebSecurity {
    final FarmRepository farmRepository;


//    public boolean checkPostAuthor(String postId, String userName) {
//        Post post = postRepository.findById(postId).orElse(null);
//        return post != null && post.getAuthor().equalsIgnoreCase(userName);
//    }
}
