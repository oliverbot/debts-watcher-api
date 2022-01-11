package br.com.debts.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.LongStream;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TotalDebts {

    private List<DebtsByDebtSource> debtSources;
    private SummarizedDebts summarizedDebts;

}
