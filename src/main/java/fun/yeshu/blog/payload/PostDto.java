package fun.yeshu.blog.payload;

import java.util.Set;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "Post model information")
@Data
public class PostDto {

    @ApiModelProperty(value = "Blog post id")
    private Long id;

    // title should not be null or empty
    // title should hava at least 2 characters
    @ApiModelProperty(value = "Blog post title")
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;
    
    @ApiModelProperty(value = "Blog post description")
    @NotEmpty
    @Size(min = 10, message = "Post description should have at least 10 characters")
    private String description;

    @ApiModelProperty(value = "Blog post content")
    @NotEmpty
    private String content;

    @ApiModelProperty(value = "Blog post comments")
    private Set<CommentDto> comments;
}
