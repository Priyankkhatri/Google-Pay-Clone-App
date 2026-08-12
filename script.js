// PayMate Web Application Interactive Logic

let activeRecipient = '';

function showToast(message) {
    const toast = document.getElementById('toast');
    toast.innerText = message;
    toast.classList.add('show');
    setTimeout(() => {
        toast.classList.remove('show');
    }, 2400);
}

function openPaymentModal(name) {
    activeRecipient = name;
    document.getElementById('modalRecipient').innerText = 'Pay ' + name;
    document.getElementById('payAmount').value = '';
    document.getElementById('payNote').value = '';
    document.getElementById('paymentModal').classList.add('open');
    setTimeout(() => {
        document.getElementById('payAmount').focus();
    }, 100);
}

function closePaymentModal() {
    document.getElementById('paymentModal').classList.remove('open');
}

function confirmPayment() {
    const amount = document.getElementById('payAmount').value;
    if (!amount || amount <= 0) {
        showToast('Please enter a valid amount');
        return;
    }
    closePaymentModal();
    showToast(`Successfully paid ₹${amount} to ${activeRecipient}! 🎉`);
}

// Bottom Nav Tab Switcher
document.querySelectorAll('.nav-tab').forEach((tab) => {
    tab.addEventListener('click', function () {
        document.querySelectorAll('.nav-tab').forEach(t => t.classList.remove('active'));
        this.classList.add('active');
        const tabName = this.querySelector('span').innerText;
        showToast(`${tabName} tab selected`);
    });
});

// Click Handlers for Dashboard Actions
document.getElementById('searchBar').addEventListener('click', () => {
    showToast('Search clicked - Pay by name or phone');
});

document.getElementById('btnProfile').addEventListener('click', () => {
    showToast('User Profile clicked - Account & Settings');
});

document.getElementById('cardPromo').addEventListener('click', () => {
    showToast('Promotional Offer - Instant Loan apply clicked');
});

document.getElementById('btnScanQr').addEventListener('click', () => {
    openPaymentModal('QR Merchant');
});

document.getElementById('btnPayAnyone').addEventListener('click', () => {
    openPaymentModal('Any Contact');
});

document.getElementById('btnBankTransfer').addEventListener('click', () => {
    openPaymentModal('Bank Account');
});

document.getElementById('btnMobileRecharge').addEventListener('click', () => {
    showToast('Mobile Recharge clicked');
});

document.getElementById('chipUpiLite').addEventListener('click', () => {
    showToast('UPI Lite Balance: ₹2,000');
});

document.getElementById('chipRewards').addEventListener('click', () => {
    showToast('You earned 4 Scratch Cards!');
});

document.getElementById('chipUpiId').addEventListener('click', () => {
    showToast('Your UPI ID: paymate@bank');
});

document.getElementById('rowCibilScore').addEventListener('click', () => {
    showToast('Your CIBIL Score is 785 (Excellent)');
});

document.getElementById('rowTransactionHistory').addEventListener('click', () => {
    showToast('Opening Transaction History...');
});

document.getElementById('rowCheckBalance').addEventListener('click', () => {
    showToast('Bank Account Balance: ₹45,280.50');
});

document.getElementById('cardSubscriptions').addEventListener('click', () => {
    showToast('Explore Subscriptions clicked');
});

document.getElementById('cardGiftCards').addEventListener('click', () => {
    showToast('Explore Gift Cards clicked');
});

document.getElementById('cardPersonalLoan').addEventListener('click', () => {
    showToast('Personal Loan application clicked');
});

document.getElementById('cardGoldLoan').addEventListener('click', () => {
    showToast('Gold Loan application clicked');
});
