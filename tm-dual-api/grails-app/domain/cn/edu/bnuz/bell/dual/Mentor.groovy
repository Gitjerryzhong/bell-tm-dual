package cn.edu.bnuz.bell.dual

import cn.edu.bnuz.bell.organization.Department
import cn.edu.bnuz.bell.organization.Teacher

/**
 * 论文指导老师
 */
class Mentor {

    Teacher teacher

    /**
     * 聘用部门
     */
    Department department

    /**
     * 邮箱地址
     */
    String email

    /**
     * 微信号
     */
    String vChatId

    static mapping = {
        comment     '论文指导老师'
        table       schema: 'tm_dual'
        id          generator: 'identity', comment: '无意义ID'
        department  comment: '聘用部门'
        teacher     comment: '教师'
        email       comment: '邮件地址'
        vChatId     length: 50, comment: '微信号'
    }

    static constraints = {
        teacher     unique: 'department'
        vChatId     nullable: true
    }
}
