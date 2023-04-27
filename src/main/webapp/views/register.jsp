<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script>

    $(function () {
        register_form.init();
    });
</script>

<div class="col-sm-8 text-left">
    <div class="container">
        <h1>Register</h1><br/>

        <form id="register_form" class="form-horizontal text-left well">
            <div class="form-group">
                <label for="id">ID</label><br/>
                <div class="col-sm-8">
                    <input type="text" id="id" name="id" placeholder="Your ID..">
                </div>
            </div>
            <div class="form-group">
                <label for="pwd">Password</label><br/>
                <div class="col-sm-8">
                    <input type="password" id="pwd" name="pwd" placeholder="Password..">
                </div>
            </div>
            <div class="form-group">
                <label for="name">Name</label><br/>
                <div class="col-sm-8">
                    <input type="text" id="name" name="name" placeholder="Your Name..">
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-8">
                    <button id="register_btn" type="button" class="btn btn-default">Register</button>
                </div>
            </div>
        </form>
    </div>
</div>

<style>
    input[type=text], select {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input[type=password], select {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    input[type=submit] {
        width: 100%;
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    input[type=submit]:hover {
        background-color: #45a049;
    }

    /*div {*/
    /*    border-radius: 5px;*/
    /*    background-color: #f2f2f2;*/
    /*    padding: 20px;*/
    /*}*/


    .container {
        width: 60%
    }
</style>
