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

// реализация запроса на /login
@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    final FarmRepository farmRepository;

    @Override
    public UserDetails loadUserByUsername(String farmEmail) throws UsernameNotFoundException {
        Farm farm = farmRepository.findByEmail(farmEmail)
                .orElseThrow(() -> new UsernameNotFoundException(farmEmail));

        System.out.println("log password: " + farm.getPassword());
        Collection<String> authorities = farm.getRoles().stream().map(r -> "ROLE_" + r.name()).toList();

        return new User(
                farmEmail,
                farm.getPassword(),
                AuthorityUtils.createAuthorityList(authorities)
        );
    }

}

