<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/reset.css">
    <link rel="stylesheet" href="/css/adobe.css">
    <title>Document</title>
</head>

<body>
    <header>
        <h1><img src="/IMG/adobeImg/logo.jpg" alt="" /></h1>
    </header>
    <main>
        <div class="toparea">
            <video src="/IMG/adobeImg/Illustrator.mp4" autoplay muted loop></video>
            <p>Illustrator의 새로운 발견! 매력적인 그래픽을 어디에서나 디자인</p>
        </div>
        <div class="bottomarea">
            <ul class="btn">
                <li><a href="">새로운 기능</a></li>
                <li><a href="">다양한 작품</a></li>
            </ul>
        </div>
    </main>
    <aside>
        <img src="/IMG/adobeImg/illustratorMove.png" alt="" />
    </aside>

    <article class="art1">
        <div class="inner">
            <h2>새로운 기능 소개</h2>
            <p>
                새로운 기능이 지속적으로 추가되는 Illustrator를 통해 정교한 기능으로
                멋진 작품을 만들어 보세요. Creative Cloud 멤버십을 통해 새로운 기능을
                출시와 동시에 이용할 수 있습니다
            </p>
            <ul>
                <li>
                    <figure><img src="/IMG/adobeImg/illustrator01.jpg" alt="" /></figure>
                    <figcaption>강력해진 클라우드 문서</figcaption>
                </li>
                <li>
                    <figure><img src="/IMG/adobeImg/illustrator02.jpg" alt="" /></figure>
                    <figcaption>공동 편집</figcaption>
                </li>
                <li>
                    <figure><img src="/IMG/adobeImg/illustrator03.jpg" alt="" /></figure>
                    <figcaption>단번에 패턴 적용</figcaption>
                </li>
                <li>
                    <figure><img src="/IMG/adobeImg/illustrator04.jpg" alt="" /></figure>
                    <figcaption>향상된 글리프 스냅핑</figcaption>
                </li>
            </ul>
            <a href="#" class="close"><img src="/IMG/adobeImg/close.png" alt="" /></a>
        </div>
        <span class="line top"></span>
        <span class="line right"></span>
        <span class="line bottom"></span>
        <span class="line left"></span>
    </article>

    <article class="art2">
        <div class="inner2">
            <h2>Illustrator의 새로운 발견 아티스트 스토리, 튜토리얼, 라이브 스트리밍 이벤트 등을 확인하세요.</h2>
            <ul>
                <li>
                    <figure><img src="/IMG/adobeImg/art01.jpg" alt="" /></figure>
                    <figcaption>inspiration / illustration</figcaption>
                </li>
                <li>
                    <figure><img src="/IMG/adobeImg/art02.jpg" alt="" /></figure>
                    <figcaption>inspiration / graphic-design</figcaption>
                </li>
                <li>
                    <figure><img src="/IMG/adobeImg/art03.jpg" alt="" /></figure>
                    <figcaption>inspiration / illustration, graphic-design</figcaption>
                </li>
            </ul>
            <a href="#" class="close"><img src="/IMG/adobeImg/close.png" alt="" /></a>
        </div>
    </article>

    <footer>
        <h3>주요제품</h3>
        <ul class="link">
            <li>
                <a href="#">
                    <span><img src="/IMG/adobeImg/reader_appicon_64_grayscale.svg" alt="" /></span>
                    Adobe Acrobat Reader
                </a>
            </li>
            <li>
                <a href="#">
                    <span><img src="/IMG/adobeImg/Adobe_Express_FP_Icon.svg" alt="" /></span>
                    Adobe Express</a>
            </li>
            <li>
                <a href="#">
                    <span><img src="/IMG/adobeImg/ps_appicon_64_grayscale.svg" alt="" /></span>
                    Photoshop</a>
            </li>
            <li>
                <a href="#">
                    <span><img src="/IMG/adobeImg/ai_appicon_64_grayscale.svg" alt="" /></span>
                    Illustrator
                </a>
            </li>
        </ul>
    </footer>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script>
        function article1Show() {
            $("span.top").animate({ width: "100%" }, 1000, function () {
                $("span.right").animate({ height: "100%" }, 1000, function () {
                    $("span.bottom").animate({ width: "100%" }, 1000, function () {
                        $("span.left").animate({ height: "100%" }, 1000, function () {
                            $(".art1 .inner").fadeIn(1000);
                        });
                    });
                });
            });
        }
        function lineHide() {
            $("span.top").animate({ width: "0%" }, 1000);
            $("span.right").animate({ height: "0%" }, 1000);
            $("span.bottom").animate({ width: "0%" }, 1000);
            $("span.left").animate({ height: "0%" }, 1000);
        }

        function mainHide() {
            $('.toparea').animate({ top: '-1000px' }, 1000)
            $('.bottomarea').animate({ bottom: '-1000px' }, 1000)
            $('aside').animate({ left: '80%' }, 1000)

        }
        function mainShow() {
            $('.toparea').delay(2000).animate({ top: '0' }, 1000)
            $('.bottomarea').delay(2000).animate({ bottom: '0' }, 1000)
            $('aside').delay(2000).animate({ left: '60%' }, 1000)
        }

        $(".btn li").eq(0).click(function (e) {
            e.preventDefault();
            mainHide()
            article1Show();
        });

        // art2


        function article2Show() {
            $(".art2 .inner2").animate({ width: '100%' }).fadeIn(1000);

        }

        function mainHide2() {
            $('.toparea').animate({ top: '-1000px' }, 1000)
            $('.bottomarea').animate({ bottom: '-1000px' }, 1000)
            $('aside').animate({ left: '100%' }, 1000)

        }

        function mainShow2() {
            $('.toparea').delay(2000).animate({ top: '0' }, 1000)
            $('.bottomarea').delay(2000).animate({ bottom: '0' }, 1000)
            $('aside').delay(2000).animate({ left: '60%' }, 1000)
        }


        $(".btn li").eq(1).click(function (e) {
            e.preventDefault();
            mainHide2()
            article2Show();
        });


        $("a.close").click(function (e) {
            e.preventDefault();
            $(this)
                .parents(".inner")
                .delay(1000)
                .fadeOut(500, function () {
                    lineHide();
                });
            mainShow2()
        });

    </script>
</body>

</html>