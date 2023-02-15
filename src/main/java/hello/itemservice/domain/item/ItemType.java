package hello.itemservice.domain.item;

/**
 * packageName  : hello.itemservice.domain.item
 * fileName     : ItemType
 * author       : sshan
 * date         : 2023-02-15
 * description  :
 * ========================================================
 * DATE            AUTHOR              NOTE
 * --------------------------------------------------------
 * 2023-02-15          sshan            최초생성
 */
public enum ItemType {

    BOOK("도서"), FOOD("식품"), ETC("기타");

    private final String description; //설명을 위한 필드

    ItemType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
