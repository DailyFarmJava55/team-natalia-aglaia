package java55.farm.security;

import java55.farm.auth.dao.AccountRepository;
import java55.farm.auth.model.Account;
import java55.farm.auth.model.Farm;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    final AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.findById(username)
                .orElseThrow(() -> new UsernameNotFoundException(username));

        System.out.println(account.getPassword());
        Collection<String> authorities = account.getRoles().stream().map(r -> "ROLE_" + r.name()).toList();

        return new User(
                username,
                account.getPassword(),
                AuthorityUtils.createAuthorityList(authorities)
        );
    }

}

