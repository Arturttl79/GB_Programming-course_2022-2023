import { useOktaAuth } from "@okta/okta-react";
import { Redirect } from "react-router-dom";
import OktaSignInWidget from "./OktaSignInWidget";
import SpinnerLoading from "../layouts/Utils/SpinnerLoading";

function LoginWidget({ config }) {
    const { oktaAuth, authState } = useOktaAuth();
    const onSuccess = (tokens) => {
        oktaAuth.handleLoginRedirect(tokens);
    };

    const onError = (err) => {
        console.log("Ошибка входа: ", err);
    }

    if (!authState) {
        return (
            <SpinnerLoading />
        );
    }

    return authState.isAuthenticated ?
    <Redirect
        to={{ pathname: "/" }}
    />
    :
    <OktaSignInWidget
        config={config}
        onSuccess={onSuccess}
        onError={onError}
    />;
};

export default LoginWidget;