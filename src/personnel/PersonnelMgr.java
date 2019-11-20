package personnel;

import java.sql.*;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class PersonnelMgr extends PesonnelConnection {
	private static PersonnelMgr instance = new PersonnelMgr();
	public static PersonnelMgr getInstance() {
		return instance;
	}
	private PersonnelMgr() { }
	
	public ArrayList<PersonnelBean> personnelList() throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		ArrayList<PersonnelBean> personnel = new ArrayList<PersonnelBean>();
		
		try {
			conn = getConnection();
			sql = "SELECT * FROM PERSONNEL";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				PersonnelBean psn = new PersonnelBean();
				psn.setId(rs.getInt(1));
				psn.setName(rs.getString(2));
				psn.setDept(rs.getString(3));
				psn.setPosition(rs.getInt(4));
				psn.setDuty(rs.getString(5));
				psn.setPhone(rs.getString(6));
				personnel.add(psn);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			closeDBResources(rs, pstmt, conn);
		}
		
		return personnel;
	}
	
	public ArrayList<PersonnelBean> searchPersonnel(String id, String dept, String type) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		ArrayList<PersonnelBean> personnel = new ArrayList<PersonnelBean>();
		
		try {
			conn = getConnection();
			if(type.equals("y")) {
				sql = "SELECT * FROM PERSONNEL WHERE ID = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					PersonnelBean psn = new PersonnelBean();
					psn.setId(rs.getInt(1));
					psn.setName(rs.getString(2));
					psn.setDept(rs.getString(3));
					psn.setPosition(rs.getInt(4));
					psn.setDuty(rs.getString(5));
					psn.setPhone(rs.getString(6));
					personnel.add(psn);
				}
			} else {
				sql = "SELECT * FROM PERSONNEL WHERE DEPT = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, dept);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					PersonnelBean psn = new PersonnelBean();
					psn.setId(rs.getInt(1));
					psn.setName(rs.getString(2));
					psn.setDept(rs.getString(3));
					psn.setPosition(rs.getInt(4));
					psn.setDuty(rs.getString(5));
					psn.setPhone(rs.getString(6));
					personnel.add(psn);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			closeDBResources(rs, pstmt, conn);
		}
		
		return personnel;
	}
	
	public int signPersonnel(HttpServletRequest req) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rs = -1;
		String sql = null;
		try {
			conn = getConnection();
			sql = "INSERT INTO PERSONNEL"
					+ " (ID, NAME, DEPT, POSITION, DUTY, PHONE)"
					+ " VALUES (?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(req.getParameter("id")));
			pstmt.setString(2, req.getParameter("name"));
			pstmt.setString(3, req.getParameter("dept"));
			pstmt.setInt(4, Integer.parseInt(req.getParameter("position")));
			pstmt.setString(5, req.getParameter("duty"));
			pstmt.setString(6, req.getParameter("phone"));
			rs = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			closeDBResources(pstmt, conn);
		}
		return rs;
	}
	
	public void updatePersonnel(HttpServletRequest req) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			conn = getConnection();
			sql = "UPDATE PERSONNEL"
					+ " SET NAME=?, DEPT=?, POSITION=?, DUTY=?, PHONE=?"
					+ " WHERE ID=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, req.getParameter("name"));
			pstmt.setString(2, req.getParameter("dept"));
			pstmt.setInt(3, Integer.parseInt(req.getParameter("position")));
			pstmt.setString(4, req.getParameter("duty"));
			pstmt.setString(5, req.getParameter("phone"));
			pstmt.setInt(6, Integer.parseInt(req.getParameter("id")));
			rs = pstmt.executeQuery();			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			closeDBResources(rs, pstmt, conn);
		}
	}
	
	public void removePersonnel(HttpServletRequest req) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			conn = getConnection();
			sql = "DELETE FROM PERSONNEL"
					+ " WHERE NAME=? AND ID=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, req.getParameter("name"));
			pstmt.setInt(2, Integer.parseInt(req.getParameter("id")));
			rs = pstmt.executeQuery();			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			closeDBResources(rs, pstmt, conn);
		}
	}
}
