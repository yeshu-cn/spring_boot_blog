package fun.yeshu.blog.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "Comment model information")
@Data
public class CommentDto {
    @ApiModelProperty(value = "Comment id")
    private long id;

    @ApiModelProperty(value = "Comment name")
    @NotEmpty(message = "Name should not be null or empty")
    private String name;

    @ApiModelProperty(value = "Comment email")
    @NotEmpty(message = "Email should not be null or empty")
    @Email
    private String email;

    @ApiModelProperty(value = "Comment body")
    @NotEmpty(message = "Comment body should not be null or empty")
    @Size(min = 10, message = "Comment body must be minimum 10 characters")
    private String body;
}
