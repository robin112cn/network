package com.whty.cms.tspm.common;

public abstract class Constant {

	/**
	 * 数据字典的启用、停用状态
	 * @author dengzm
	 *
	 */
	public interface EnabledStatus{
		/**
		 * 启用
		 */
		public static final String ENABLED = "00";

		/**
		 * 停用
		 */
		public static final String DISABLED = "01";
	}

	/**
	 * 页面状态
	 * @author Administrator
	 *
	 */
	public interface PageStatus{
		/**
		 * 新增
		 */
		public  static final String SAVESTATUSADD="add";
		/**
		 * 编辑
		 */
		public static final String SAVESTATUSUPDATE="update";
		/**
		 * 审批
		 */
		public static final String SAVESTATUSAPPROVE="approve";

	}

	/**
	 * TR状态
	 * @author Administrator
	 *
	 */
	public interface TrStatus{
		/**
		 * 待注册
		 */
		public static final String PENDING_REGISTRATION="00";
		/**
		 * 注册中
		 */
		public static final String REGISTERING="01";
		/**
		 * 正常
		 */
		public static final String NORMAL="02";
		/**
		 * 审核未通过
		 */
		public static final String NOTPASS="03";
		/**
		 * 注销
		 */
		public static final String CANCEL="04";

	}

	/**
	 * TR状态
	 * @author Administrator
	 *
	 */
	public interface Operation{
		/**
		 * 注册
		 */
		public static final String REGISTER="00";
		/**
		 * 销毁
		 */
		public static final String CANCEL="01";

	}

	/**
	 * 序列名称
	 * @author Administrator
	 *
	 */
	public interface SeqName{
		/**
		 * TR_ID
		 */
		public static final String TR_ID="TR_ID";

	}

	/**
	 * 统计周期
	 * @author Administrator
	 *
	 */
	public interface Period{
		public static final String DAYS="0";
		public static final String MONTHS="1";
		public static final String QUARTERS="2";
		public static final String YEARS="3";

	}



}
