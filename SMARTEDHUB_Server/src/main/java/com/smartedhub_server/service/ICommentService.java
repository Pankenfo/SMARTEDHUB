package com.smartedhub_server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.smartedhub_server.pojo.Comment;
import com.smartedhub_server.pojo.GeneralReturn;

/**
 * <p>
 * For storage the users’ comment  服务类
 * </p>
 *
 * @author Junxian Cai
 * @since 2023-10-15
 */
public interface ICommentService extends IService<Comment> {

    GeneralReturn createComment(Comment comment);
}
