package org.mt.mms.commonError;

import org.apache.coyote.BadRequestException;
import org.apache.ibatis.javassist.NotFoundException;
import org.mt.mms.company.common.dto.Result;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ContollerExceptionAdvice {

    @ExceptionHandler
    public ResponseEntity<Result> handleException(Exception e) {
        // 에러 원인에 대한 로깅 추가

        return ResponseEntity.ok()
                .body(Result.resError("서버에러입니다."));
    }


    @ExceptionHandler
    public ResponseEntity<Result> handleException(BadRequestException e) { //400
        return ResponseEntity.ok()
                .body(Result.resError("잘못된 요청입니다."));
    }


    @ExceptionHandler public ResponseEntity<Result> handleException(NotFoundException e) { //404
        return ResponseEntity.ok()
                .body(Result.resError("존재하지 않습니다."));

    }
}

