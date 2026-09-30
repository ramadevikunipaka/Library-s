package com.library.controller;

import com.library.model.Member;
import com.library.service.MemberService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/members")
public class MemberServlet extends HttpServlet {
    private final MemberService service = new MemberService();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, jakarta.servlet.ServletException {
        try {
            req.setAttribute("members", service.findAll());
            req.getRequestDispatcher("/members.jsp").forward(req, resp);
        } catch (Exception e) {
            throw new jakarta.servlet.ServletException(e);
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        try {
            Member m = new Member(
                    req.getParameter("name"),
                    req.getParameter("email"),
                    req.getParameter("phone"),
                    req.getParameter("address"));
            service.add(m);
            resp.sendRedirect(req.getContextPath() + "/members");
        } catch (Exception e) {
            throw new jakarta.servlet.ServletException(e);
        }
    }
}
