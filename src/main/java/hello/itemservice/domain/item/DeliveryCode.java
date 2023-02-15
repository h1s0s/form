package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * packageName  : hello.itemservice.domain.item
 * fileName     : DeliveryCode
 * author       : sshan
 * date         : 2023-02-15
 * description  :
 * ========================================================
 * DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-02-15          sshan            최초생성
 */

/**
 * FAST : 빠른배송
 * NORMAL : 느린배송
 * SLOW : 느린배송
 */
@Data
@AllArgsConstructor//모든 값을 파라미터로 받는 생성자를 만듬 <-> NoArgsConstructor 기본 생성자
public class DeliveryCode {
    private String code;
    private String displayName;
}
