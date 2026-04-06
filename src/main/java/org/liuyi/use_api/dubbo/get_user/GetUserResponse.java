package org.liuyi.use_api.dubbo.get_user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.liuyi.use_api.dubbo.BaseResponse;

import java.io.Serializable;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class GetUserResponse extends BaseResponse {
    private String userId;
    private String avatarFileId;
    private String phone;
    private String desc;
    private String nickname;
}
