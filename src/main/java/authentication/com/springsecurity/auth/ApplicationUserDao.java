package authentication.com.springsecurity.auth;

import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public interface ApplicationUserDao {
    public Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
