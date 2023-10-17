package com.smartedhub_server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 * <p>
 * Storage the details of each question
 * </p>
 *
 * @author Junxian Cai
 * @since 2023-10-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_question")
@ApiModel(value="Question对象", description="Storage the details of each question")
public class Question implements Serializable {

    protected static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id of question")
    @TableId(value = "question_id", type = IdType.AUTO)
    protected Integer questionId;

    @ApiModelProperty(value = "the detail of question")
    @TableField("question_detail")
    protected String questionDetail;

    @ApiModelProperty(value = "question title")
    @TableField("question_title")
    protected String questionTitle;

    @ApiModelProperty(value = "question date")
    @TableField("question_date")
    protected Date questionDate;

    @ApiModelProperty(value = "id of teacher")
    @TableField("teacher_id")
    protected Integer teacherId;

    @ApiModelProperty(value = "correct answer of MCQ")
    @TableField("correct_answer")
    protected String correctAnswer;

    @ApiModelProperty(value = "is it valid or not")
    protected Integer validity;


}
