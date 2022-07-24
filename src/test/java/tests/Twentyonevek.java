package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Tag("21vek")
public class Twentyonevek extends TestBase {
    @Test
    @DisplayName("Наличие элементов главной страницы")
    void searchTest() {

        $(AppiumBy.xpath("//android.view.View[@content-desc=\"Все акции\"]/android.widget.TextView")).shouldHave(text("Все акции"));
        $$(AppiumBy.className("android.widget.Button")).findBy(text("Каталог")).shouldHave(text("Каталог"));
        $$(AppiumBy.className("android.widget.Button")).findBy(text("Search")).shouldHave(text("Search"));
        $$(AppiumBy.className("android.view.View")).findBy(text("ПОПУЛЯРНЫЕ ТОВАРЫ")).shouldHave(text("ПОПУЛЯРНЫЕ ТОВАРЫ"));
        $$(AppiumBy.className("android.webkit.WebView")).findBy(text("Онлайн-гипермаркет 21vek.by")).shouldHave(text("Онлайн-гипермаркет 21vek.by"));

    }

    @Test
    @DisplayName("Открытие вкладки Все Акции")
    void searchTest2() {

        $(AppiumBy.xpath("//android.view.View[@content-desc=\"Все акции\"]")).click();
        $(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]")).shouldHave(text("Все акции"));
        $$(AppiumBy.className("android.widget.Button")).findBy(text("Категории")).shouldBe(visible);
        $$(AppiumBy.className("android.widget.Button")).findBy(text("Фильтр")).shouldBe(visible);
    }

    @Test
    @DisplayName("Открытие вкладки Каталог")
    void searchTest3() {

        $$(AppiumBy.className("android.widget.Button")).findBy(text("Каталог")).click();
        $$(AppiumBy.className("android.view.View")).findBy(text("Каталог товаров")).shouldHave(text("Каталог товаров"));

    }

    @Test
    @DisplayName("Наличие разделов в Каталоге")
    void searchTest4() {
        $$(AppiumBy.className("android.widget.Button")).findBy(text("Каталог")).click();
        $$(AppiumBy.className("android.view.View")).findBy(text("Все акции")).shouldBe(visible);
        $$(AppiumBy.className("android.view.View")).findBy(text("Бытовая техника")).shouldBe(visible);
        $$(AppiumBy.className("android.view.View")).findBy(text("Смартфоны, ТВ и электроника")).shouldBe(visible);
        $$(AppiumBy.className("android.view.View")).findBy(text("Компьютеры и периферия")).shouldBe(visible);
        $$(AppiumBy.className("android.view.View")).findBy(text("Мебель")).shouldBe(visible);
        $$(AppiumBy.className("android.view.View")).findBy(text("Товары для дома")).shouldBe(visible);

    }
    @Test
    @DisplayName("Добавление товара из главной страницы в корзину")
    void searchTest5() {
        $$(AppiumBy.className("android.widget.Button")).findBy(text("В корзину")).click();
        $$(AppiumBy.className("android.widget.TextView")).findBy(text("1")).shouldBe(visible);

    }
}