package com.pims.api.response.code;

/**
 * ResultCode
 * response 결과 코드
 *
 * @author 남철진, 김해승
 * @version V0.1
 */
public enum ResultCode {

    //성공
    SUCCESS("S0000", com.pims.api.response.code.MessageCode.RESULT_CODE_SUCCESS_MESSAGE),

    // 요청오류
    BAD_REQUEST_ERROR("E4000", com.pims.api.response.code.MessageCode.RESULT_CODE_BAD_REQUEST_MESSAGE),
    NOT_LOGIN_ERROR("E4001", com.pims.api.response.code.MessageCode.RESULT_CODE_NOT_LOGIN_ERROR),
    COMMUNICATION_ERROR("E4002", com.pims.api.response.code.MessageCode.RESULT_CODE_SERVER_COMMUNICATION_ERROR_MESSAGE),
    FORBIDDEN_ERROR("E4003", com.pims.api.response.code.MessageCode.RESULT_CODE_FORBIDDEN_ERROR),
    NOT_FOUND_ERROR("E4004", com.pims.api.response.code.MessageCode.RESULT_CODE_NOT_FOUND_MESSAGE),
    FILE_SIZE_ERROR_ERROR("E4005", com.pims.api.response.code.MessageCode.RESULT_CODE_FILE_SIZE_ERROR),

    // 내부 오류
    SERVER_ERROR("E5000", com.pims.api.response.code.MessageCode.RESULT_CODE_SERVER_ERROR_MESSAGE),
    SQL_FOREIGN_KEY_ERROR("E5001", com.pims.api.response.code.MessageCode.RESULT_CODE_SQL_FOREIGN_KEY),
    UNKNOWN_ERROR("E5002", com.pims.api.response.code.MessageCode.RESULT_CODE_UNKNOWN_ERROR),

    // 토큰 오류
    NOT_TOKEN_ERROR("E6001", com.pims.api.response.code.MessageCode.RESULT_CODE_NOT_TOKEN_ERROR),
    MALFORMED_TOKEN_ERROR("E6002", com.pims.api.response.code.MessageCode.RESULT_CODE_MALFORMED_TOKEN_ERROR),
    EXPIRED_TOKEN_ERROR("E6003", com.pims.api.response.code.MessageCode.RESULT_CODE_EXPIRED_TOKEN_ERROR),
    UNSUPPORTED_TOKEN_ERROR("E6004", com.pims.api.response.code.MessageCode.RESULT_CODE_UNSUPPORTED_TOKEN_ERROR),
    ARGUMENT_TOKEN_ERROR("E6005", com.pims.api.response.code.MessageCode.RESULT_CODE_ARGUMENT_TOKEN_ERROR);


    private final String code;
    private final com.pims.api.response.code.MessageCode messageCode;

    ResultCode(String code, com.pims.api.response.code.MessageCode messageCode) {
        this.code = code;
        this.messageCode = messageCode;
    }

    public String getCode() {
        return code;
    }

    public com.pims.api.response.code.MessageCode getMessageCode() {
        return messageCode;
    }

}

