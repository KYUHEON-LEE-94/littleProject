<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet" href="/css/account.css">
<title>Document</title>
</head>
<body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
    <script defer type="module" src="/js/app.js"></script>

    <div class="Wrapper">
        <h2 id="title">Korea IT Bank 은행 계좌 관리 사이트</h2>
        <div class="container">
            <div class="row">
                <div class="col-10 ssn">
                    <div class="input-group">
                        <span class="input-group-text form-control-lg">학번</span>
                        <input type="text" aria-label="First name" class="form-control" id="ssninput">
                    </div>
                </div>
                <div class="col-2 ssn_btnBox">
                    <button type="button" class="btn btn-primary" id="ssnBtnSearch">검색</button>
                    <button type="button" class="btn btn-danger" id="ssnBtnDelete">삭제</button>
                </div>
            </div>
            <div class="row">
                <div class="col-10 studentname">
                    <div class="input-group">
                        <span class="input-group-text form-control-lg">학생명</span>
                        <input type="text" aria-label="First name" class="form-control" id="studentnameinput">
                    </div>
                </div>
                <div class="col-2 accountOwner_btnBox">
                    <button type="button" class="btn btn-primary" id="stNameBtn">검색</button>
                    <button type="button" class="btn btn-danger" id="stNameDelete">삭제</button>
                </div>
            </div>
            <div class="row">
                <div class="col subject">
                    <div class="input-group">
                        <span class="input-group-text form-control-lg">국어</span>
                        <input type="text" aria-label="First name" class="form-control" id="kor">
                    </div>
                </div>
                <div class="col subject">
                    <div class="input-group">
                        <span class="input-group-text form-control-lg">영어</span>
                        <input type="text" aria-label="First name" class="form-control" id="eng">
                    </div>
                </div>
                <div class="col subject">
                    <div class="input-group">
                        <span class="input-group-text form-control-lg">수학</span>
                        <input type="text" aria-label="First name" class="form-control" id="math">
                    </div>
                </div>
                <div class="col-2 subject">
                    <button type="button" class="btn btn-primary subjectBtn" id="enroll">등록</button>
                    <button type="button" class="btn btn-success subjectBtn" id="SearchAll">전체 검색</button>
                </div>
            </div>
            <span id="status"></span>
        </div>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">학번</th>
                    <th scope="col">학생명</th>
                    <th scope="col">국어</th>
                    <th scope="col">영어</th>
                    <th scope="col">수학</th>
                </tr>
            </thead>
            <tbody>
                <tr class="tr">
                    <th scope="row"></th>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
            </tbody>
        </table>

    </div>
    <!-- Wrppaer -->
    <footer>
        E-mail: panpan68@naver.com
    </footer>

</body>
</html>