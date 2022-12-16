package vendingmachine.values

// require message
const val REQUIRE_VENDING_MACHINE_AMOUNT_MESSAGE = "자판기가 보유하고 있는 금액을 입력해 주세요."
const val REQUIRE_PRODUCTS_MESSAGE = "상품명과 가격, 수량을 입력해 주세요."
const val REQUIRE_INPUT_AMOUNT_MESSAGE = "투입 금액을 입력해 주세요."
const val REQUIRE_PURCHASE_PRODUCT_NAME_MESSAGE = "구매할 상품명을 입력해 주세요."

// notice message
const val NOTICE_INPUT_AMOUNT_MESSAGE_FORMAT = "투입 금액: %d원"
const val NOTICE_VENDING_MACHINE_COINS_MESSAGE = "자판기가 보유한 동전"
const val NOTICE_COIN_COUNT_MESSAGE_FORMAT = "%d원 - %d개"
const val NOTICE_REMAINING_MONEY_MESSAGE = "잔돈"
const val NOTICE_ERROR_MESSAGE = "[ERROR] "

// value condition message
const val COST_CONDITION_MESSAGE = "금액은 숫자여야 합니다."
const val COUNT_CONDITION_MESSAGE = "개수는 숫자여야 합니다."
const val PRODUCT_INPUT_FORM_CONDITION_MESSAGE = "상품 가격은 '[콜라,1500,20];[사이다,1000,10]'의 형태로 작성하여야 합니다."
const val PRODUCT_COST_CONDITION_MESSAGE = "상품 가격은 100원 이상, 10단위여야 합니다."