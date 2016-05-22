package cn.edu.nuaa.burning.exception;

/**
 * qiyuey on 2016/4/9.
 */
public class ResourceNotFoundException extends BaseException {

    private static final long serialVersionUID = -7495933202664764663L;

    public ResourceNotFoundException() {
        super(103, "系统找不到指定的资源。", 404);
    }
}
