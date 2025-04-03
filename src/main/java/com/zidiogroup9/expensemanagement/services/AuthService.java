package com.zidiogroup9.expensemanagement.services;

import com.zidiogroup9.expensemanagement.dtos.*;

public interface AuthService {
    UserDto signUp(SignUpDto signUpDto);
    LoginResponseDto login(LoginDto loginDto);
}
