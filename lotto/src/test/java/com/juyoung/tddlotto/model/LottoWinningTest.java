package com.juyoung.tddlotto.model;

import org.junit.Test;

import java.util.List;

import static com.juyoung.tddlotto.model.LottoTest.ofLotto;
import static com.juyoung.tddlotto.model.LottoTest.ofLottoNumbers;
import static org.assertj.core.api.Assertions.assertThat;

public class LottoWinningTest {

    @Test
    public void 당첨번호를_생성한다() {
        WinningLotto lottoWinning = WinningLotto.of();
        assertThat(lottoWinning.size()).isEqualTo(7);
        assertThat(lottoWinning.getBonus()).isNotNull();
    }

    @Test
    public void 당첨번호와_해당로또번호와_일치하는_갯수() {
        Lotto compareLotto = ofLotto(1, 2, 3, 4, 7, 9);
        WinningLotto lottoWinning = ofLottoWinning(new int[]{1, 2, 3, 4, 7, 9}, 10);
        int result = lottoWinning.match(compareLotto);
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void 당첨번호와_해당로또번호와_보너스가_있는지() {
        WinningLotto lottoWinning = ofLottoWinning(new int[]{1, 2, 3, 4, 7, 9}, 10);
        List<Number> compareLotto = ofLottoNumbers(1, 2, 3, 4, 7, 10);

        boolean result = lottoWinning.isMatchBonus(compareLotto);
        assertThat(result).isTrue();
    }

    @Test
    public void 로또번호_모두_일치() {
        Lotto lotto = ofLotto(1, 2, 3, 4, 5, 6);
        WinningLotto lottoWinning = ofLottoWinning(new int[]{1, 2, 3, 4, 5, 6}, 10);

        Prize result = lottoWinning.result(lotto);

        assertThat(result).isEqualTo(Prize.FIRST);
    }

    @Test
    public void $2등_로또번호_5개_일치() {
        Lotto lotto = ofLotto(1, 2, 3, 4, 5, 6);
        WinningLotto lottoWinning = ofLottoWinning(new int[]{1, 2, 3, 4, 5, 9}, 10);

        Prize result = lottoWinning.result(lotto);

        assertThat(result).isEqualTo(Prize.SECOND);
    }

    @Test
    public void $3등_로또번호_5개_일치_보너스_포함() {
        Lotto lotto = ofLotto(1, 2, 3, 4, 5, 6);
        WinningLotto lottoWinning = ofLottoWinning(new int[]{1, 2, 3, 4, 7, 9}, 6);

        Prize result = lottoWinning.result(lotto);

        assertThat(result).isEqualTo(Prize.THIRD);
    }

    public static WinningLotto ofLottoWinning(int[] lottoNumbers,
                                              int bonus) {
        List<Number> numbers = ofLottoNumbers(lottoNumbers);
        return new WinningLotto(numbers, Number.of(bonus));
    }
}