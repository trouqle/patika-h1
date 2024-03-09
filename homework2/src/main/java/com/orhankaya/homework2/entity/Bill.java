package com.orhankaya.homework2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
    private Long id;
    private LocalDateTime billDateTime;
    private Long totalPrice;
    private Order order;
}
