package org.liuyi.use_api.dubbo;

import org.liuyi.use_api.dubbo.get_user.GetUserRequest;
import org.liuyi.use_api.dubbo.get_user.GetUserResponse;

public interface UserService {
    GetUserResponse getUser(GetUserRequest request);
}
