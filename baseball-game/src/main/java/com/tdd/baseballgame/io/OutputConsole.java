package com.tdd.baseballgame.io;

import com.tdd.baseballgame.model.Answer;
import com.tdd.baseballgame.model.Digit;
import com.tdd.baseballgame.model.Numbers;
import com.tdd.baseballgame.model.result.AnswerResult;
import com.tdd.baseballgame.model.result.ResultType;

import java.util.List;
import java.util.Map;

public class OutputConsole {

    public static void answer(Answer answer) {
        Numbers numbers = answer.getNumbers();
        List<Digit> digits = numbers.getDigits();
        System.out.println("------------------------");
        System.out.print("DIGIT : ");
        for (Digit digit : digits) {
            System.out.print(digit.getNumber() + " ");
        }
        System.out.println("\n------------------------");
    }

    public static void result(AnswerResult answerResult) {
        System.out.println("------------------------");
        System.out.println("TURN [" + answerResult.getTryCount() + "]");
        Map<ResultType, Integer> resultType = answerResult.getResult();
        for(Map.Entry<ResultType, Integer> result : resultType.entrySet()){
            System.out.println(result.getKey().name() + ": " + result.getValue());
        }
        System.out.println("------------------------");
    }
}