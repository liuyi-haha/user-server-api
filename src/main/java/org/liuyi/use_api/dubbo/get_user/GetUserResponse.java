package org.liuyi.use_api.dubbo.get_user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetUserResponse implements Serializable {
    private String userId;
    private String avatarFileId;
    private String phone;
    private String desc;
    private String nickname;
}
