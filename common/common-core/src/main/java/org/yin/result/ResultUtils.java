package org.yin.result;


/**
 * 返回工具类
 *
 */
public class ResultUtils {

    /**
     * 成功
     *
     *
     * @return
     */
    public static <T> BaseResponse<T> success() {
        return new  BaseResponse<>(200, null, "ok");
    }
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(200, data, "ok");
    }
    public static <T> BaseResponse<T> success(Integer code, T data) {
        return new BaseResponse<>(code, data, "ok");
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     *
     * @param code
     * @param message
     * @return
     */
    public static BaseResponse error(int code, String message) {
        return new BaseResponse(code, null, message);
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode, String message) {
        return new BaseResponse(errorCode.getCode(), null, message);
    }
}
