package java55.farm.security;

import java55.farm.auth_farm.dao.FarmRepository;
import java55.farm.auth_farm.model.Farm;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;


//@Service
//@RequiredArgsConstructor
public class UserDetailsServiceImpl
//        implements UserDetailsService
        {
//    final FarmRepository farmRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Farm farm = farmRepository.findById(username)
//                .orElseThrow(() -> new UsernameNotFoundException(username));
//
//        System.out.println(farm.getPassword());
//        Collection<String> authorities = farm.getRoles().stream().map(r -> "ROLE_" + r.name()).toList();
//
//        return new User(
//                username,
//                farm.getPassword(),
//                AuthorityUtils.createAuthorityList(authorities)
//        );
//    }

}

