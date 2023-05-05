package com.p2plending.borrower.service;

import com.p2plending.borrower.model.MyUserDetail;
import com.p2plending.borrower.model.UserModel;
import com.p2plending.borrower.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel user = userRepository.findByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("no user found !!!");
        }
        return new MyUserDetail(user);
    }
}
