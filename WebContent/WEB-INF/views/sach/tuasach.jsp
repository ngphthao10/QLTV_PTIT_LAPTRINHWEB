<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.18.0/font/bootstrap-icons.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@docsearch/css@3">
   	<style>
   		.button-container{
		   text-align: right;
		}
		.button-container .modal-body{
		   text-align: left;
		}
		.modal-content{
		 background-color: #ece0d1;
		}
		.modal-header{
		 background-color: #634832;
		 color: #fff;
		}
		   		
   	</style>
</head>
	<body>
	<%@include file="/WEB-INF/views/include/navbar.jsp"%>
	<div class="container-fluid">
        <div class="row">
        	<%@include file="/WEB-INF/views/include/sidebar.jsp"%>
		
		<div class="main-content col-md-10">
              <div class="container">
                <div class="row">
                  <div class="col-6 mt-4 ps-4 mt-4"><h3>QUẢN LÝ TỰA SÁCH</h3></div>
                  <div class="col-6 d-grid gap-2 button-container d-md-block mt-4">
                    <button class="btn btn-secondary"  data-bs-target="#exampleModalToggle" data-bs-toggle="modal">
                      <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-circle mb-1" viewBox="0 0 16 16">
                        <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14m0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16"/>
                        <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4"/>
                      </svg>
                      Thêm tựa sách</button>
                      <!-- Modal -->
                      <div class="modal fade" id="exampleModalToggle" tabindex="-1" aria-labelledby="exampleModalToggleLabel" aria-hidden="true">
                        <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable ">
                          <div class="modal-content ">
                            <div class="modal-header">
                              <h1 class="modal-title fs-5" id="exampleModalToggleLabel">Thêm tựa sách</h1>
                              <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>  
                            </div>
                            <div class="modal-body">
                              <form class="was-validated">
                                <div class="mb-3">
                                  <label for="validationTextarea" class="form-label">Tên tựa sách*</label>
                                  <input class="form-control" id="validationTextarea" placeholder="" required></input>
                                  <div class="invalid-feedback">Vui lòng nhập tựa sách.</div>
                                </div>
                                <div class="mb-3">
                                  <label for="validationTextarea" class="form-label">Thể loại*</label>
                                  <select class="form-select" required aria-label="select example">
                                    <option value="">Open this select menu</option>
                                    <option value="1">One</option>
                                    <option value="2">Two</option>
                                    <option value="3">Three</option>
                                  </select>
                                  <div class="invalid-feedback">Vui lòng chọn thể loại.</div>
                                </div>
                                <div class="mb-3">
                                  <label for="validationTextarea" class="form-label">Danh sách tác giả</label>
                                  <textarea class="form-control" id="validationTextarea" placeholder="" required disabled></textarea>
                                  <div class="invalid-feedback">Vui lòng chọn tác giả.</div>
                                </div>
                                <div class="mb-3">
                                  <label for="validationTextarea" class="form-label">Tác giả*</label>
                                  <div class="row">
                                    <div class="col-sm-8">
                                      <select class="form-select" required aria-label="select example">
                                        <option value="">Open this select menu</option>
                                        <option value="1">One</option>
                                        <option value="2">Two</option>
                                        <option value="3">Three</option>
                                      </select>
                                    </div>
                                    <div class="col-sm-4"  style="text-align: right;">  
                                      <p class="d-inline-flex gap-1">
                                        <button style="background-color: #634832; color: #fff;" class="btn btn-primary" data-bs-target="#exampleModalToggle2" data-bs-toggle="modal">
                                          <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-circle mb-1" viewBox="0 0 16 16">
                                            <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14m0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16"/>
                                            <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4"/>
                                          </svg>
                                          Thêm tác giả</button>
                                      </p>
                                    </div>
                                  </div>
                                </div>
                                <div class="mb-3" style="text-align: right;">
                                  <button class="btn btn-warning" type="submit">Lưu thông tin</button>
                                </div>
                              </form> 
                            </div>
                          </div>
                        </div>
                      </div>
                      <!-- Model2 -->
                      <div class="modal fade" id="exampleModalToggle2" aria-hidden="true" aria-labelledby="exampleModalToggleLabel2" tabindex="-1">
                        <div class="modal-dialog modal-dialog-centered">
                          <div class="modal-content">
                            <div class="modal-header">
                              <h1 class="modal-title fs-5" id="exampleModalToggleLabel2">Quản lý tác giả</h1>
                              <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                              <form class="was-validated">
                                <div class="row">
                                  <div class="col-sm-8">
                                    <label for="validationTextarea" class="form-label">Họ và tên</label>
                                    <input class="form-control" id="validationTextarea" placeholder="Họ và tên tác giả" required></input>
                                    <div class="invalid-feedback">
                                      Vui lòng nhập họ và tên tác giả bạn muốn thêm.
                                    </div>
                                  </div>
                                  <div class="col-sm-4" >  
                                    <p class="d-flex flex-column h-100 justify-content-center align-items-center d-block mx-auto">
                                      <button style="background-color: #634832; color: #fff;" class="btn btn-primary" type="button">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-circle mb-1" viewBox="0 0 16 16">
                                          <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14m0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16"/>
                                          <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4"/>
                                        </svg>
                                        Thêm tác giả</button>
                                    </p>
                                  </div>
                                </div>
                                <table class="table table-hover table-bordered mt-3">
                                  <thead>
                                    <tr>
                                      <th scope="col">Mã tác giả</th>
                                      <th scope="col">Tên tác giả</th>
                                    </tr>
                                  </thead>
                                  <tbody class="table-group-divider">
                                    <tr>
                                      <td>Mark</td>
                                      <td>
                                        <div class="row">
                                          <div class="col-sm-6">
                                              mdo
                                          </div>
                                          <div class="col-sm-6" style="text-align: right;" >
                                            <button class="btn btn-outline-success btn-sm" data-bs-target="#ModalToggle2" data-bs-toggle="modal">Sửa</button>
                                          </div>
                                        </div>
                                      </td>
                                    </tr>
                                    <tr>
                                      <td>Jacob</td>
                                      <td>Thornton</td>
                                    </tr>
                                    <tr>
                                      <td>Larry the Bird</td>
                                      <td>Larry the Bird</td>
                                    </tr>
                                  </tbody>
                                </table>
                              </div>
                            </form>
                              <div class="modal-footer">
                                <button class="btn btn-warning" data-bs-target="#exampleModalToggle" data-bs-toggle="modal">Quay lại</button>
                              </div>
                          </div>
                        </div>
                      </div>
                    <button class="btn btn-secondary" type="button">
                      <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-x-circle mb-1" viewBox="0 0 16 16">
                        <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14m0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16"/>
                        <path d="M4.646 4.646a.5.5 0 0 1 .708 0L8 7.293l2.646-2.647a.5.5 0 0 1 .708.708L8.707 8l2.647 2.646a.5.5 0 0 1-.708.708L8 8.707l-2.646 2.647a.5.5 0 0 1-.708-.708L7.293 8 4.646 5.354a.5.5 0 0 1 0-.708"/>
                      </svg>
                      Ẩn tựa sách</button>
                    <button class="btn btn-secondary" type="button">
                      <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-circle mb-1" viewBox="0 0 16 16">
                        <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14m0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16"/>
                        <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4"/>
                      </svg>
                      Hiện tựa sách</button>
                  </div>
                </div>
                
              <div class="d-flex justify-content-end mt-3">
                <form class="d-flex col-6" role="search">
                    <input class="form-control me-2"  type="search" placeholder="Mã, tên, tác giả" aria-label="Search">
                    <button class="btn btn-outline-success" style="min-width: 120px;" type="submit">
                      <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-search mb-1" viewBox="0 0 16 16">
                        <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001q.044.06.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1 1 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0"/>
                      </svg>
                      Tìm kiếm
                    </button>
                </form>
                <form class="d-flex col-6 ps-4" role="search">
                  <select class="form-select me-2" aria-label="Default select example">
                    <option selected>Open this select menu</option>
                    <option value="1">One</option>
                    <option value="2">Two</option>
                    <option value="3">Three</option>
                  </select>
                   <button class="btn btn-outline-success" style="min-width: 150px;" type="submit">
                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-funnel mb-1" viewBox="0 0 16 16">
                      <path d="M1.5 1.5A.5.5 0 0 1 2 1h12a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-.128.334L10 8.692V13.5a.5.5 0 0 1-.342.474l-3 1A.5.5 0 0 1 6 14.5V8.692L1.628 3.834A.5.5 0 0 1 1.5 3.5zm1 .5v1.308l4.372 4.858A.5.5 0 0 1 7 8.5v5.306l2-.666V8.5a.5.5 0 0 1 .128-.334L13.5 3.308V2z"/>
                    </svg>
                    Lọc thể loại
                  </button>
                </form>
              </div>
            </div>
              <div class="container">
                <table class="table table-hover table-bordered mt-4">
                  <thead>
                    <tr>
                      <th scope="col">Mã tựa sách</th>
                      <th scope="col">Tên tựa sách</th>
                      <th scope="col">Thể loại</th>
                      <th scope="col">Tác giả</th>
                      <th scope="col">Đã ẩn</th>
                    </tr>
                  </thead>
                  <tbody class="table-group-divider">
                    <tr>
                      <th scope="row">1</th>
                      <td  class="align-middle">Mark</td>
                      <td  class="align-middle">Mark</td>
                      <td  class="align-middle">Mark</td>
                      <td>
                        <div class="row">
                          <div class="col-sm-6">
                              mdo
                          </div>
                          <div class="col-sm-6" style="text-align: right;"  data-bs-target="#ModalToggle" data-bs-toggle="modal">
                            <button class="btn btn-outline-success btn-sm" >Sửa</button>
                            <!-- Modal -->
                            <div class="modal fade" style="text-align: left;"  id="ModalToggle" tabindex="-1" aria-labelledby="exampleModalToggleLabel" aria-hidden="true">
                              <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable ">
                                <div class="modal-content ">
                                  <div class="modal-header">
                                    <h1 class="modal-title fs-5" id="exampleModalToggleLabel">Sửa thông tin tựa sách</h1>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>  
                                  </div>
                                  <div class="modal-body">
                                    <form class="was-validated">
                                      <div style="text-align: center;">
                                        <label for="validationTextarea" class="form-label" ><h6>Mã tựa sách:</h6></label>
                                      </div>
                                      <div class="mb-3">
                                        <label for="validationTextarea" class="form-label">Tên tựa sách</label>
                                        <input class="form-control" id="validationTextarea" placeholder="" required></input>
                                        <div class="invalid-feedback">Vui lòng nhập tựa sách.</div>
                                      </div>
                                      <div class="mb-3">
                                        <label for="validationTextarea" class="form-label">Thể loại</label>
                                        <select class="form-select" required aria-label="select example">
                                          <option value="">Chọn thể loại</option>
                                          <option value="1">One</option>
                                          <option value="2">Two</option>
                                          <option value="3">Three</option>
                                        </select>
                                        <div class="invalid-feedback">Vui lòng chọn thể loại.</div>
                                      </div>
                                      <div class="mb-3">
                                        <label for="validationTextarea" class="form-label">Danh sách tác giả</label>
                                        <textarea class="form-control" id="validationTextarea" placeholder="" required disabled></textarea>
                                        <div class="invalid-feedback">Vui lòng chọn tác giả.</div>
                                      </div>
                                      <div class="mb-3">
                                        <label for="validationTextarea" class="form-label">Tác giả</label>
                                        <div class="row">
                                          <div class="col-sm-8">
                                            <select class="form-select" required aria-label="select example">
                                              <option value="">Open this select menu</option>
                                              <option value="1">One</option>
                                              <option value="2">Two</option>
                                              <option value="3">Three</option>
                                            </select>
                                          </div>
                                          <div class="col-sm-4"  style="text-align: right;">  
                                            <p class="d-inline-flex gap-1">
                                              <button style="background-color: #634832; color: #fff;" class="btn btn-primary" data-bs-target="#exampleModalToggle2" data-bs-toggle="modal">
                                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-circle mb-1" viewBox="0 0 16 16">
                                                  <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14m0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16"/>
                                                  <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4"/>
                                                </svg>
                                                Thêm tác giả</button>
                                            </p>
                                          </div>
                                        </div>
                                      </div>
                                      <div class="mb-3" style="text-align: right;">
                                        <button class="btn btn-warning" type="submit">Lưu thông tin</button>
                                      </div>
                                    </form> 
                                  </div>
                                </div>
                              </div>
                            </div>
                          </div>
                        </div>
                      </td>
                    </tr>
                    <c:forEach var="p" items="${sach}">
					<tr>
						<td>${p.maTuaSach}</td>
						<td>${p.tenTuaSach}</td>
						<td>${p.idTheLoai}</td>
						<td>${p.DaAn}</td>
						
					</tr>
					</c:forEach>
                    
                  </tbody>
                </table>
                <div class="pb-4 rounded">
                  <div class="row">
                    <div class="col-4">
                      <div>Trang số</div>
                    </div>
                    <div class="col-8" style="text-align: right;">
                      <div class="btn-group" role="group" aria-label="Basic example">
                        <button type="button" class="btn btn-outline-dark">1</button>
                        <button type="button" class="btn btn-outline-dark">2</button>
                        <button type="button" class="btn btn-outline-dark">3</button>
                        <button type="button" class="btn btn-outline-dark">4</button>
                        <button type="button" class="btn btn-outline-dark">5</button>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
                <div class="modal fade" style="text-align: left;"  id="ModalToggle2" tabindex="-1" aria-labelledby="ModalToggleLabel" aria-hidden="true">
      <div class="modal-dialog modal-sm modal-dialog-centered modal-dialog-scrollable ">
        <div class="modal-content ">
          <div class="modal-header">
            <h1 class="modal-title fs-5" id="ModalToggleLabel">Sửa thông tin tác giả</h1>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>  
          </div>
          <div class="modal-body">
            <form class="was-validated">
              <div>
                <label for="validationTextarea" class="form-label" >Mã tác giả:</label>
              </div>
              <div class="mb-3">
                <label for="validationTextarea" class="form-label">Tên tác giả</label>
                <input class="form-control" id="validationTextarea" placeholder="" required></input>
                <div class="invalid-feedback">Vui lòng nhập tên tác giả.</div>
              </div>
              <div class="mb-3" style="text-align: right;">
                <button class="btn btn-warning" type="submit">Lưu thông tin</button>
              </div>
            </form> 
          </div>
          <!-- <div class="modal-footer">
            <button class="btn btn-warning" data-bs-target="#ModalToggle" data-bs-toggle="modal">Quay lại</button>
          </div> -->
        </div>
      </div>
    </div>
    
        </div>
          
          
          

	</div>	
 	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

  </body>
</html>      